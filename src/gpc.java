import javax.annotation.Nullable;

public class gpc implements gql<gpc> {
   public static final ajo a = new ajo("sounds", ".ogg");
   private final ajv b;
   private final bnn c;
   private final bnn d;
   private final int e;
   private final gpc.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gpc(String $$0, bnn $$1, bnn $$2, int $$3, gpc.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new ajv($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ajv a() {
      return this.b;
   }

   public ajv b() {
      return a.a(this.b);
   }

   public bnn c() {
      return this.c;
   }

   public bnn d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gpc a(axt $$0) {
      return this;
   }

   @Override
   public void a(gqg $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gpc.a f() {
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
      public static gpc.a a(String $$0) {
         for (gpc.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
