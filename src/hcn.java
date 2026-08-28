import javax.annotation.Nullable;

public class hcn implements hdx<hcn> {
   public static final ale a = new ale("sounds", ".ogg");
   private final all b;
   private final brp c;
   private final brp d;
   private final int e;
   private final hcn.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hcn(all $$0, brp $$1, brp $$2, int $$3, hcn.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public all a() {
      return this.b;
   }

   public all b() {
      return a.a(this.b);
   }

   public brp c() {
      return this.c;
   }

   public brp d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hcn a(azv $$0) {
      return this;
   }

   @Override
   public void a(hds $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hcn.a f() {
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
      public static hcn.a a(String $$0) {
         for (hcn.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
