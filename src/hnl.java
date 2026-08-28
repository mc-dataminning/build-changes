import javax.annotation.Nullable;

public class hnl implements how<hnl> {
   public static final akz a = new akz("sounds", ".ogg");
   private final alg b;
   private final bto c;
   private final bto d;
   private final int e;
   private final hnl.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hnl(alg $$0, bto $$1, bto $$2, int $$3, hnl.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public alg a() {
      return this.b;
   }

   public alg b() {
      return a.a(this.b);
   }

   public bto c() {
      return this.c;
   }

   public bto d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hnl a(azv $$0) {
      return this;
   }

   @Override
   public void a(hor $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hnl.a f() {
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
      public static hnl.a a(String $$0) {
         for (hnl.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
