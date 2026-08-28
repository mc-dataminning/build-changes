import javax.annotation.Nullable;

public class gtv implements gvf<gtv> {
   public static final akk a = new akk("sounds", ".ogg");
   private final akr b;
   private final bpz c;
   private final bpz d;
   private final int e;
   private final gtv.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gtv(akr $$0, bpz $$1, bpz $$2, int $$3, gtv.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public akr a() {
      return this.b;
   }

   public akr b() {
      return a.a(this.b);
   }

   public bpz c() {
      return this.c;
   }

   public bpz d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gtv a(ayw $$0) {
      return this;
   }

   @Override
   public void a(gva $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gtv.a f() {
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
      public static gtv.a a(String $$0) {
         for (gtv.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
