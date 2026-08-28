import javax.annotation.Nullable;

public class hif implements hjq<hif> {
   public static final akn a = new akn("sounds", ".ogg");
   private final aku b;
   private final brr c;
   private final brr d;
   private final int e;
   private final hif.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hif(aku $$0, brr $$1, brr $$2, int $$3, hif.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public aku a() {
      return this.b;
   }

   public aku b() {
      return a.a(this.b);
   }

   public brr c() {
      return this.c;
   }

   public brr d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hif a(azh $$0) {
      return this;
   }

   @Override
   public void a(hjl $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hif.a f() {
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
      public static hif.a a(String $$0) {
         for (hif.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
