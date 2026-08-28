import javax.annotation.Nullable;

public class him implements hjx<him> {
   public static final ako a = new ako("sounds", ".ogg");
   private final akv b;
   private final brs c;
   private final brs d;
   private final int e;
   private final him.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public him(akv $$0, brs $$1, brs $$2, int $$3, him.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public akv a() {
      return this.b;
   }

   public akv b() {
      return a.a(this.b);
   }

   public brs c() {
      return this.c;
   }

   public brs d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public him a(azh $$0) {
      return this;
   }

   @Override
   public void a(hjs $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public him.a f() {
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
      public static him.a a(String $$0) {
         for (him.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
