import javax.annotation.Nullable;

public class gtx implements gvh<gtx> {
   public static final akk a = new akk("sounds", ".ogg");
   private final akr b;
   private final bpz c;
   private final bpz d;
   private final int e;
   private final gtx.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gtx(akr $$0, bpz $$1, bpz $$2, int $$3, gtx.a $$4, boolean $$5, boolean $$6, int $$7) {
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

   public gtx a(ayw $$0) {
      return this;
   }

   @Override
   public void a(gvc $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gtx.a f() {
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
      public static gtx.a a(String $$0) {
         for (gtx.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
