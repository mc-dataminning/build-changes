import javax.annotation.Nullable;

public class fxv implements fze<fxv> {
   public static final acj a = new acj("sounds", ".ogg");
   private final acq b;
   private final bdf c;
   private final bdf d;
   private final int e;
   private final fxv.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public fxv(String $$0, bdf $$1, bdf $$2, int $$3, fxv.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new acq($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public acq a() {
      return this.b;
   }

   public acq b() {
      return a.a(this.b);
   }

   public bdf c() {
      return this.c;
   }

   public bdf d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public fxv a(apf $$0) {
      return this;
   }

   @Override
   public void a(fyz $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public fxv.a f() {
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
      public static fxv.a a(String $$0) {
         for (fxv.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
