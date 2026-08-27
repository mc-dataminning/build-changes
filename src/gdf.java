import javax.annotation.Nullable;

public class gdf implements geo<gdf> {
   public static final afp a = new afp("sounds", ".ogg");
   private final afw b;
   private final bhj c;
   private final bhj d;
   private final int e;
   private final gdf.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gdf(String $$0, bhj $$1, bhj $$2, int $$3, gdf.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new afw($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public afw a() {
      return this.b;
   }

   public afw b() {
      return a.a(this.b);
   }

   public bhj c() {
      return this.c;
   }

   public bhj d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gdf a(ate $$0) {
      return this;
   }

   @Override
   public void a(gej $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gdf.a f() {
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
      public static gdf.a a(String $$0) {
         for (gdf.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
