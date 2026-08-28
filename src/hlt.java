import javax.annotation.Nullable;

public class hlt implements hne<hlt> {
   public static final akx a = new akx("sounds", ".ogg");
   private final ale b;
   private final btg c;
   private final btg d;
   private final int e;
   private final hlt.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hlt(ale $$0, btg $$1, btg $$2, int $$3, hlt.a $$4, boolean $$5, boolean $$6, int $$7) {
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

   public btg c() {
      return this.c;
   }

   public btg d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hlt a(azt $$0) {
      return this;
   }

   @Override
   public void a(hmz $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hlt.a f() {
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
      public static hlt.a a(String $$0) {
         for (hlt.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
