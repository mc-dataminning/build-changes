import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class ls implements lx {
   private final ly<ls> a;
   private final int b;

   public static MapCodec<ls> a(ly<ls> $$0) {
      return ayy.j.xmap($$1 -> new ls($$0, $$1), $$0x -> $$0x.b).fieldOf("color");
   }

   public static za<? super ByteBuf, ls> b(ly<ls> $$0) {
      return yy.g.a($$1 -> new ls($$0, $$1), $$0x -> $$0x.b);
   }

   private ls(ly<ls> $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ly<ls> a() {
      return this.a;
   }

   public float b() {
      return (float)aya.b(this.b) / 255.0F;
   }

   public float c() {
      return (float)aya.c(this.b) / 255.0F;
   }

   public float d() {
      return (float)aya.d(this.b) / 255.0F;
   }

   public float e() {
      return (float)aya.a(this.b) / 255.0F;
   }

   public static ls a(ly<ls> $$0, int $$1) {
      return new ls($$0, $$1);
   }

   public static ls a(ly<ls> $$0, float $$1, float $$2, float $$3) {
      return a($$0, aya.a(1.0F, $$1, $$2, $$3));
   }
}
