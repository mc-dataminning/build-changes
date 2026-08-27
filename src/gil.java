import javax.annotation.Nullable;

public class gil implements gju<gil> {
   public static final aha a = new aha("sounds", ".ogg");
   private final ahh b;
   private final bjk c;
   private final bjk d;
   private final int e;
   private final gil.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gil(String $$0, bjk $$1, bjk $$2, int $$3, gil.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new ahh($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ahh a() {
      return this.b;
   }

   public ahh b() {
      return a.a(this.b);
   }

   public bjk c() {
      return this.c;
   }

   public bjk d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gil a(auw $$0) {
      return this;
   }

   @Override
   public void a(gjp $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gil.a f() {
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
      public static gil.a a(String $$0) {
         for (gil.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
