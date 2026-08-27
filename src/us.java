import io.netty.buffer.ByteBuf;

public class us {
   private static final int a = 5;
   private static final int b = 127;
   private static final int c = 128;
   private static final int d = 7;

   public static int a(int $$0) {
      for (int $$1 = 1; $$1 < 5; $$1++) {
         if (($$0 & -1 << $$1 * 7) == 0) {
            return $$1;
         }
      }

      return 5;
   }

   public static boolean a(byte $$0) {
      return ($$0 & 128) == 128;
   }

   public static int a(ByteBuf $$0) {
      int $$1 = 0;
      int $$2 = 0;

      byte $$3;
      do {
         $$3 = $$0.readByte();
         $$1 |= ($$3 & 127) << $$2++ * 7;
         if ($$2 > 5) {
            throw new RuntimeException("VarInt too big");
         }
      } while (a($$3));

      return $$1;
   }

   public static ByteBuf a(ByteBuf $$0, int $$1) {
      while (($$1 & -128) != 0) {
         $$0.writeByte($$1 & 127 | 128);
         $$1 >>>= 7;
      }

      $$0.writeByte($$1);
      return $$0;
   }
}
