import javax.annotation.Nullable;

public class gsl implements gty<gsl> {
   public static final aky a = new aky("sounds", ".ogg");
   private final alf b;
   private final bqd c;
   private final bqd d;
   private final int e;
   private final gsl.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gsl(String $$0, bqd $$1, bqd $$2, int $$3, gsl.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new alf($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public alf a() {
      return this.b;
   }

   public alf b() {
      return a.a(this.b);
   }

   public bqd c() {
      return this.c;
   }

   public bqd d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gsl a(azh $$0) {
      return this;
   }

   @Override
   public void a(gtt $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gsl.a f() {
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
      public static gsl.a a(String $$0) {
         for (gsl.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
