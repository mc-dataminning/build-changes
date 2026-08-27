import javax.annotation.Nullable;

public class ggt implements gic<ggt> {
   public static final agm a = new agm("sounds", ".ogg");
   private final agt b;
   private final bit c;
   private final bit d;
   private final int e;
   private final ggt.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public ggt(String $$0, bit $$1, bit $$2, int $$3, ggt.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new agt($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public agt a() {
      return this.b;
   }

   public agt b() {
      return a.a(this.b);
   }

   public bit c() {
      return this.c;
   }

   public bit d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public ggt a(auf $$0) {
      return this;
   }

   @Override
   public void a(ghx $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public ggt.a f() {
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
      public static ggt.a a(String $$0) {
         for (ggt.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
