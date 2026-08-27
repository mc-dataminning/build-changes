import javax.annotation.Nullable;

public class gbq implements gcz<gbq> {
   public static final aek a = new aek("sounds", ".ogg");
   private final aer b;
   private final bfy c;
   private final bfy d;
   private final int e;
   private final gbq.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gbq(String $$0, bfy $$1, bfy $$2, int $$3, gbq.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new aer($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public aer a() {
      return this.b;
   }

   public aer b() {
      return a.a(this.b);
   }

   public bfy c() {
      return this.c;
   }

   public bfy d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gbq a(aru $$0) {
      return this;
   }

   @Override
   public void a(gcu $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gbq.a f() {
      return this.f;
   }

   public boolean g() {
      return this.g;
   }

   public boolean h() {
      return this.h;
   }

   public int i() {
      return this.i;
   }

   @Override
   public String toString() {
      return "Sound[" + this.b + "]";
   }

   public static enum a {
      a("file"),
      b("event");

      private final String c;

      private a(String $$0) {
         this.c = $$0;
      }

      @Nullable
      public static gbq.a a(String $$0) {
         for (gbq.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
