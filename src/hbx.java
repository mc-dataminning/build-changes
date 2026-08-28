import javax.annotation.Nullable;

public class hbx implements hdh<hbx> {
   public static final alb a = new alb("sounds", ".ogg");
   private final ali b;
   private final brl c;
   private final brl d;
   private final int e;
   private final hbx.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hbx(ali $$0, brl $$1, brl $$2, int $$3, hbx.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ali a() {
      return this.b;
   }

   public ali b() {
      return a.a(this.b);
   }

   public brl c() {
      return this.c;
   }

   public brl d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hbx a(azs $$0) {
      return this;
   }

   @Override
   public void a(hdc $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hbx.a f() {
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
      public static hbx.a a(String $$0) {
         for (hbx.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
