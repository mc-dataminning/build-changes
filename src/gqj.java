import javax.annotation.Nullable;

public class gqj implements grs<gqj> {
   public static final aka a = new aka("sounds", ".ogg");
   private final akh b;
   private final bou c;
   private final bou d;
   private final int e;
   private final gqj.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gqj(String $$0, bou $$1, bou $$2, int $$3, gqj.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new akh($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public akh a() {
      return this.b;
   }

   public akh b() {
      return a.a(this.b);
   }

   public bou c() {
      return this.c;
   }

   public bou d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gqj a(ayg $$0) {
      return this;
   }

   @Override
   public void a(grn $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gqj.a f() {
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
      public static gqj.a a(String $$0) {
         for (gqj.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
