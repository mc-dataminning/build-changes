import javax.annotation.Nullable;

public class gpy implements grh<gpy> {
   public static final ajy a = new ajy("sounds", ".ogg");
   private final akf b;
   private final bny c;
   private final bny d;
   private final int e;
   private final gpy.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gpy(String $$0, bny $$1, bny $$2, int $$3, gpy.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new akf($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public akf a() {
      return this.b;
   }

   public akf b() {
      return a.a(this.b);
   }

   public bny c() {
      return this.c;
   }

   public bny d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gpy a(ayd $$0) {
      return this;
   }

   @Override
   public void a(grc $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gpy.a f() {
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
      public static gpy.a a(String $$0) {
         for (gpy.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
