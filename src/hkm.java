import javax.annotation.Nullable;

public class hkm implements hlx<hkm> {
   public static final akw a = new akw("sounds", ".ogg");
   private final ald b;
   private final bsy c;
   private final bsy d;
   private final int e;
   private final hkm.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hkm(ald $$0, bsy $$1, bsy $$2, int $$3, hkm.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ald a() {
      return this.b;
   }

   public ald b() {
      return a.a(this.b);
   }

   public bsy c() {
      return this.c;
   }

   public bsy d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hkm a(azs $$0) {
      return this;
   }

   @Override
   public void a(hls $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hkm.a f() {
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
      public static hkm.a a(String $$0) {
         for (hkm.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
