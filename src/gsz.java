import javax.annotation.Nullable;

public class gsz implements guj<gsz> {
   public static final akd a = new akd("sounds", ".ogg");
   private final akk b;
   private final bpo c;
   private final bpo d;
   private final int e;
   private final gsz.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gsz(String $$0, bpo $$1, bpo $$2, int $$3, gsz.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new akk($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public akk a() {
      return this.b;
   }

   public akk b() {
      return a.a(this.b);
   }

   public bpo c() {
      return this.c;
   }

   public bpo d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gsz a(ayo $$0) {
      return this;
   }

   @Override
   public void a(gue $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gsz.a f() {
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

      private a(final String $$0) {
         this.c = $$0;
      }

      @Nullable
      public static gsz.a a(String $$0) {
         for (gsz.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
