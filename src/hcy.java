import javax.annotation.Nullable;

public class hcy implements hei<hcy> {
   public static final alc a = new alc("sounds", ".ogg");
   private final alj b;
   private final brs c;
   private final brs d;
   private final int e;
   private final hcy.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hcy(alj $$0, brs $$1, brs $$2, int $$3, hcy.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public alj a() {
      return this.b;
   }

   public alj b() {
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

   public hcy a(azu $$0) {
      return this;
   }

   @Override
   public void a(hed $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hcy.a f() {
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
      public static hcy.a a(String $$0) {
         for (hcy.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
