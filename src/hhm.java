import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hhm implements hhp {
   private final List<hhp> a;

   public hhm(List<hhp> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hhs $$0, czy $$1, hhq $$2, czw $$3, @Nullable gmb $$4, @Nullable bxu $$5, int $$6) {
      $$0.a(this.a.size());

      for (hhp $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hhp.b> b) implements hhp.b {
      public static final MapCodec<hhm.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hhr.a.listOf().fieldOf("models").forGetter(hhm.a::b)).apply($$0, hhm.a::new)
      );

      @Override
      public MapCodec<hhm.a> a() {
         return a;
      }

      @Override
      public void a(hnr.a $$0) {
         for (hhp.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hhp a(hhp.a $$0) {
         return new hhm(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
