package com.example.androidlearningapp.data

val aiCourse = Course(
    id = "ai",
    title = "Artificial Intelligence",
    description = "Beginner AI course",
    lessons = listOf(
        Lesson(
            id = "ai_lesson_1",
            title = "Introduction to AI: Concepts, History, and Applications",
            objectives = listOf(
                "Understand the basic concepts of AI",
                "Learn about the history of AI",
                "Explore various applications of AI"
            ),
            content = "Artificial Intelligence (AI) is the simulation of human intelligence processes by machines, especially computer systems. It includes learning, reasoning, and self-correction. The history of AI dates back to the 1950s, with significant milestones such as the development of expert systems and machine learning algorithms. AI applications range from speech recognition, image processing, autonomous vehicles, to recommendation systems.",
            visualAids = listOf("ai_intro_image.png"),
            exercises = listOf(),
            summary = "AI is a field of computer science focused on creating intelligent machines that can perform tasks that typically require human intelligence.",
            checkYourUnderstanding = listOf()
        ),
        Lesson(
            id = "ai_lesson_2",
            title = "Understanding Machine Learning Basics",
            objectives = listOf(
                "Define machine learning",
                "Understand types of machine learning",
                "Learn about training data and models"
            ),
            content = "Machine Learning (ML) is a subset of AI that enables systems to learn and improve from experience without being explicitly programmed. It involves feeding data to algorithms to build models that can make predictions or decisions. Types of ML include supervised, unsupervised, and reinforcement learning.",
            visualAids = listOf("ml_basics.png"),
            exercises = listOf(),
            summary = "Machine learning allows computers to learn from data and make decisions or predictions.",
            checkYourUnderstanding = listOf()
        ),
        Lesson(
            id = "ai_lesson_3",
            title = "Supervised vs Unsupervised Learning",
            objectives = listOf(
                "Differentiate supervised and unsupervised learning",
                "Understand use cases for each type"
            ),
            content = "Supervised learning uses labeled data to train models, where the desired output is known. Unsupervised learning uses unlabeled data to find hidden patterns or intrinsic structures. Supervised learning is used in classification and regression tasks, while unsupervised learning is used in clustering and association.",
            visualAids = listOf("supervised_vs_unsupervised.png"),
            exercises = listOf(),
            summary = "Supervised learning requires labeled data, unsupervised learning does not.",
            checkYourUnderstanding = listOf()
        ),
        Lesson(
            id = "ai_lesson_4",
            title = "Introduction to Neural Networks",
            objectives = listOf(
                "Understand the structure of neural networks",
                "Learn about neurons, layers, and activation functions"
            ),
            content = "Neural networks are computing systems inspired by the biological neural networks of animal brains. They consist of layers of interconnected nodes (neurons) that process data. Activation functions determine the output of neurons. Neural networks are fundamental to deep learning.",
            visualAids = listOf("neural_network.png"),
            exercises = listOf(),
            summary = "Neural networks mimic the human brain to process complex data.",
            checkYourUnderstanding = listOf()
        ),
        Lesson(
            id = "ai_lesson_5",
            title = "Building Your First AI Model (No-code platforms)",
            objectives = listOf(
                "Learn about no-code AI platforms",
                "Build a simple AI model without coding"
            ),
            content = "No-code AI platforms allow users to build AI models using graphical interfaces without writing code. Examples include Google AutoML and Microsoft Lobe. These platforms simplify AI development for beginners.",
            visualAids = listOf("no_code_platforms.png"),
            exercises = listOf(),
            summary = "No-code platforms enable easy AI model building without programming.",
            checkYourUnderstanding = listOf()
        ),
        Lesson(
            id = "ai_lesson_6",
            title = "Ethics and Bias in AI",
            objectives = listOf(
                "Understand ethical concerns in AI",
                "Learn about bias and fairness"
            ),
            content = "AI systems can inherit biases present in training data, leading to unfair outcomes. Ethical AI involves transparency, accountability, and fairness. It is important to design AI systems that respect privacy and avoid discrimination.",
            visualAids = listOf("ethics_bias.png"),
            exercises = listOf(),
            summary = "Ethical AI aims to prevent bias and ensure fairness.",
            checkYourUnderstanding = listOf()
        ),
        Lesson(
            id = "ai_lesson_7",
            title = "Real-World Applications of AI",
            objectives = listOf(
                "Explore various AI applications in industries",
                "Understand AI's impact on society"
            ),
            content = "AI is used in healthcare for diagnosis, in finance for fraud detection, in transportation for autonomous vehicles, and in customer service for chatbots. AI is transforming industries and society by automating tasks and enabling new capabilities.",
            visualAids = listOf("ai_applications.png"),
            exercises = listOf(),
            summary = "AI has diverse applications that impact many aspects of life.",
            checkYourUnderstanding = listOf()
        )
    )
)

val cryptoCourse = Course(
    id = "crypto",
    title = "Cryptography",
    description = "Beginner Cryptography course",
    lessons = listOf(
        Lesson(
            id = "crypto_lesson_1",
            title = "What is Cryptography? History & Importance",
            objectives = listOf(
                "Define cryptography",
                "Learn about its history",
                "Understand its importance"
            ),
            content = "Cryptography is the practice of securing communication by transforming information to make it unreadable to unauthorized users. It has a long history from ancient ciphers to modern encryption techniques. Cryptography is essential for privacy and security in digital communication.",
            visualAids = listOf("crypto_intro.png"),
            exercises = listOf(),
            summary = "Cryptography secures communication and protects data.",
            checkYourUnderstanding = listOf()
        ),
        Lesson(
            id = "crypto_lesson_2",
            title = "Symmetric vs Asymmetric Encryption",
            objectives = listOf(
                "Differentiate symmetric and asymmetric encryption",
                "Understand use cases for each"
            ),
            content = "Symmetric encryption uses the same key for encryption and decryption, while asymmetric encryption uses a pair of public and private keys. Symmetric encryption is faster but less secure for key distribution. Asymmetric encryption enables secure key exchange and digital signatures.",
            visualAids = listOf("symmetric_vs_asymmetric.png"),
            exercises = listOf(),
            summary = "Symmetric uses one key; asymmetric uses key pairs.",
            checkYourUnderstanding = listOf()
        ),
        Lesson(
            id = "crypto_lesson_3",
            title = "Hashing Algorithms Explained (MD5, SHA)",
            objectives = listOf(
                "Understand hashing and its purpose",
                "Learn about common hashing algorithms"
            ),
            content = "Hashing converts data into a fixed-size string of characters, which is typically a digest that represents the data. MD5 and SHA are common hashing algorithms used for data integrity and password storage. Hashing is one-way and cannot be reversed.",
            visualAids = listOf("hashing_algorithms.png"),
            exercises = listOf(),
            summary = "Hashing ensures data integrity and security.",
            checkYourUnderstanding = listOf()
        ),
        Lesson(
            id = "crypto_lesson_4",
            title = "Public Key Infrastructure (PKI)",
            objectives = listOf(
                "Learn about PKI components",
                "Understand how PKI secures communication"
            ),
            content = "PKI is a framework for managing digital certificates and public-key encryption. It includes certificate authorities, registration authorities, and certificate revocation lists. PKI enables secure communication over the internet.",
            visualAids = listOf("pki.png"),
            exercises = listOf(),
            summary = "PKI manages digital certificates for secure communication.",
            checkYourUnderstanding = listOf()
        ),
        Lesson(
            id = "crypto_lesson_5",
            title = "Real-World Cryptographic Applications (e.g., WhatsApp, HTTPS)",
            objectives = listOf(
                "Explore cryptography in real applications",
                "Understand how encryption protects data"
            ),
            content = "Applications like WhatsApp use end-to-end encryption to secure messages. HTTPS uses SSL/TLS protocols to encrypt data between browsers and servers. Cryptography protects user privacy and data security in many applications.",
            visualAids = listOf("crypto_applications.png"),
            exercises = listOf(),
            summary = "Cryptography secures communication in many apps.",
            checkYourUnderstanding = listOf()
        ),
        Lesson(
            id = "crypto_lesson_6",
            title = "Blockchain and Cryptography Fundamentals",
            objectives = listOf(
                "Understand blockchain basics",
                "Learn how cryptography secures blockchain"
            ),
            content = "Blockchain is a distributed ledger technology that uses cryptographic hashes to secure data blocks. It enables decentralized and tamper-proof records. Cryptography ensures the integrity and security of blockchain transactions.",
            visualAids = listOf("blockchain.png"),
            exercises = listOf(),
            summary = "Blockchain uses cryptography for secure, decentralized records.",
            checkYourUnderstanding = listOf()
        ),
        Lesson(
            id = "crypto_lesson_7",
            title = "Common Attacks and Best Security Practices",
            objectives = listOf(
                "Learn about common cryptographic attacks",
                "Understand best practices for security"
            ),
            content = "Common attacks include brute force, man-in-the-middle, and side-channel attacks. Best practices involve using strong keys, regularly updating software, and following security protocols to protect data.",
            visualAids = listOf("security_practices.png"),
            exercises = listOf(),
            summary = "Security best practices help prevent cryptographic attacks.",
            checkYourUnderstanding = listOf()
        )
    )
)
