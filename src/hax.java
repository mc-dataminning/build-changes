import javax.annotation.Nullable;

public class hax implements hch<hax> {
   public static final akx a = new akx("sounds", ".ogg");
   private final ale b;
   private final bra c;
   private final bra d;
   private final int e;
   private final hax.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hax(ale $$0, bra $$1, bra $$2, int $$3, hax.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ale a() {
      return this.b;
   }

   public ale b() {
      return a.a(this.b);
   }

   public bra c() {
      return this.c;
   }

   public bra d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hax a(azn $$0) {
      return this;
   }

   @Override
   public void a(hcc $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hax.a f() {
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
      public static hax.a a(String $$0) {
         for (hax.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
