import javax.annotation.Nullable;

public class gfe implements ggn<gfe> {
   public static final agf a = new agf("sounds", ".ogg");
   private final agm b;
   private final bij c;
   private final bij d;
   private final int e;
   private final gfe.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gfe(String $$0, bij $$1, bij $$2, int $$3, gfe.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new agm($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public agm a() {
      return this.b;
   }

   public agm b() {
      return a.a(this.b);
   }

   public bij c() {
      return this.c;
   }

   public bij d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gfe a(atw $$0) {
      return this;
   }

   @Override
   public void a(ggi $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gfe.a f() {
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
      public static gfe.a a(String $$0) {
         for (gfe.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
