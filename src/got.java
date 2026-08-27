import javax.annotation.Nullable;

public class got implements gqc<got> {
   public static final ajm a = new ajm("sounds", ".ogg");
   private final ajt b;
   private final bni c;
   private final bni d;
   private final int e;
   private final got.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public got(String $$0, bni $$1, bni $$2, int $$3, got.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new ajt($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ajt a() {
      return this.b;
   }

   public ajt b() {
      return a.a(this.b);
   }

   public bni c() {
      return this.c;
   }

   public bni d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public got a(axr $$0) {
      return this;
   }

   @Override
   public void a(gpx $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public got.a f() {
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
      public static got.a a(String $$0) {
         for (got.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
