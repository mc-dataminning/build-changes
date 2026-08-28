import javax.annotation.Nullable;

public class hey implements hgi<hey> {
   public static final als a = new als("sounds", ".ogg");
   private final alz b;
   private final bsm c;
   private final bsm d;
   private final int e;
   private final hey.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hey(alz $$0, bsm $$1, bsm $$2, int $$3, hey.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public alz a() {
      return this.b;
   }

   public alz b() {
      return a.a(this.b);
   }

   public bsm c() {
      return this.c;
   }

   public bsm d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hey a(bam $$0) {
      return this;
   }

   @Override
   public void a(hgd $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hey.a f() {
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
      public static hey.a a(String $$0) {
         for (hey.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
