import javax.annotation.Nullable;

public class ghv implements gje<ghv> {
   public static final agz a = new agz("sounds", ".ogg");
   private final ahg b;
   private final bji c;
   private final bji d;
   private final int e;
   private final ghv.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public ghv(String $$0, bji $$1, bji $$2, int $$3, ghv.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new ahg($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ahg a() {
      return this.b;
   }

   public ahg b() {
      return a.a(this.b);
   }

   public bji c() {
      return this.c;
   }

   public bji d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public ghv a(auu $$0) {
      return this;
   }

   @Override
   public void a(giz $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public ghv.a f() {
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
      public static ghv.a a(String $$0) {
         for (ghv.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
