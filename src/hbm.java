import javax.annotation.Nullable;

public class hbm implements hcw<hbm> {
   public static final ala a = new ala("sounds", ".ogg");
   private final alh b;
   private final brg c;
   private final brg d;
   private final int e;
   private final hbm.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hbm(alh $$0, brg $$1, brg $$2, int $$3, hbm.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public alh a() {
      return this.b;
   }

   public alh b() {
      return a.a(this.b);
   }

   public brg c() {
      return this.c;
   }

   public brg d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hbm a(azr $$0) {
      return this;
   }

   @Override
   public void a(hcr $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hbm.a f() {
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
      public static hbm.a a(String $$0) {
         for (hbm.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
