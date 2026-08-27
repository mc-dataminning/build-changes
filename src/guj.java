import javax.annotation.Nullable;

public class guj implements gvs<guj> {
   public static final akm a = new akm("sounds", ".ogg");
   private final akt b;
   private final bpi c;
   private final bpi d;
   private final int e;
   private final guj.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public guj(String $$0, bpi $$1, bpi $$2, int $$3, guj.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new akt($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public akt a() {
      return this.b;
   }

   public akt b() {
      return a.a(this.b);
   }

   public bpi c() {
      return this.c;
   }

   public bpi d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public guj a(ayt $$0) {
      return this;
   }

   @Override
   public void a(gvn $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public guj.a f() {
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
      public static guj.a a(String $$0) {
         for (guj.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
