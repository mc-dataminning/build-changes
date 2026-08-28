import javax.annotation.Nullable;

public class gtb implements gul<gtb> {
   public static final akd a = new akd("sounds", ".ogg");
   private final akk b;
   private final bpp c;
   private final bpp d;
   private final int e;
   private final gtb.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gtb(String $$0, bpp $$1, bpp $$2, int $$3, gtb.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new akk($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public akk a() {
      return this.b;
   }

   public akk b() {
      return a.a(this.b);
   }

   public bpp c() {
      return this.c;
   }

   public bpp d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gtb a(ayo $$0) {
      return this;
   }

   @Override
   public void a(gug $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gtb.a f() {
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
      public static gtb.a a(String $$0) {
         for (gtb.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
