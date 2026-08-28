import javax.annotation.Nullable;

public class hmj implements hnu<hmj> {
   public static final akz a = new akz("sounds", ".ogg");
   private final alg b;
   private final btj c;
   private final btj d;
   private final int e;
   private final hmj.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hmj(alg $$0, btj $$1, btj $$2, int $$3, hmj.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public alg a() {
      return this.b;
   }

   public alg b() {
      return a.a(this.b);
   }

   public btj c() {
      return this.c;
   }

   public btj d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hmj a(azv $$0) {
      return this;
   }

   @Override
   public void a(hnp $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hmj.a f() {
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
      public static hmj.a a(String $$0) {
         for (hmj.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
