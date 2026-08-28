import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hjl implements hjq {
   private final gtx a;
   private final hmx b;

   public hjl(gtx $$0, hmx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(dai $$0, fld $$1, grn $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(alr b) implements hju.a {
      public static final MapCodec<hjl.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alr.a.fieldOf("texture").forGetter(hjl.a::b)).apply($$0, hjl.a::new));

      public a(czi $$0) {
         this(gsh.b($$0));
      }

      @Override
      public MapCodec<hjl.a> a() {
         return a;
      }

      @Override
      public hju<?> a(gkn $$0) {
         return new hjl(new gtx($$0), gsh.o.a(this.b));
      }
   }
}
