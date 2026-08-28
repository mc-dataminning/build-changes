import javax.annotation.Nullable;

public class hfa implements hgl<hfa> {
   public static final ali a = new ali("sounds", ".ogg");
   private final alp b;
   private final bsi c;
   private final bsi d;
   private final int e;
   private final hfa.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hfa(alp $$0, bsi $$1, bsi $$2, int $$3, hfa.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public alp a() {
      return this.b;
   }

   public alp b() {
      return a.a(this.b);
   }

   public bsi c() {
      return this.c;
   }

   public bsi d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hfa a(bac $$0) {
      return this;
   }

   @Override
   public void a(hgg $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hfa.a f() {
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
      public static hfa.a a(String $$0) {
         for (hfa.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
