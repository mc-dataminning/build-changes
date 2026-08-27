import javax.annotation.Nullable;

public class yn implements uo<ur> {
   private static final int a = 1;
   private static final int b = 2;
   @Nullable
   private final acq c;
   @Nullable
   private final ami d;

   public yn(@Nullable acq $$0, @Nullable ami $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public yn(sf $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.d = $$0.b(ami.class);
      } else {
         this.d = null;
      }

      if (($$1 & 2) > 0) {
         this.c = $$0.t();
      } else {
         this.c = null;
      }
   }

   @Override
   public void a(sf $$0) {
      if (this.d != null) {
         if (this.c != null) {
            $$0.writeByte(3);
            $$0.a(this.d);
            $$0.a(this.c);
         } else {
            $$0.writeByte(1);
            $$0.a(this.d);
         }
      } else if (this.c != null) {
         $$0.writeByte(2);
         $$0.a(this.c);
      } else {
         $$0.writeByte(0);
      }
   }

   @Nullable
   public acq a() {
      return this.c;
   }

   @Nullable
   public ami c() {
      return this.d;
   }

   public void a(ur $$0) {
      $$0.a(this);
   }
}
