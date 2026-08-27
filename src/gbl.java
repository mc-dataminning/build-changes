import javax.annotation.Nullable;

public class gbl implements gcu<gbl> {
   public static final aei a = new aei("sounds", ".ogg");
   private final aep b;
   private final bfw c;
   private final bfw d;
   private final int e;
   private final gbl.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gbl(String $$0, bfw $$1, bfw $$2, int $$3, gbl.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new aep($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public aep a() {
      return this.b;
   }

   public aep b() {
      return a.a(this.b);
   }

   public bfw c() {
      return this.c;
   }

   public bfw d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gbl a(art $$0) {
      return this;
   }

   @Override
   public void a(gcp $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gbl.a f() {
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
      public static gbl.a a(String $$0) {
         for (gbl.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
