import javax.annotation.Nullable;

public class grg implements gsp<grg> {
   public static final akg a = new akg("sounds", ".ogg");
   private final akn b;
   private final bpe c;
   private final bpe d;
   private final int e;
   private final grg.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public grg(String $$0, bpe $$1, bpe $$2, int $$3, grg.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new akn($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public akn a() {
      return this.b;
   }

   public akn b() {
      return a.a(this.b);
   }

   public bpe c() {
      return this.c;
   }

   public bpe d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public grg a(aym $$0) {
      return this;
   }

   @Override
   public void a(gsk $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public grg.a f() {
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
      public static grg.a a(String $$0) {
         for (grg.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
