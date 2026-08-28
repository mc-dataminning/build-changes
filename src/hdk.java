import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdk implements hdq<dve> {
   private final gop a;

   public hdk(gop $$0) {
      this.a = $$0;
   }

   @Nullable
   public dve a(cwn $$0) {
      return $$0.a(kv.ak);
   }

   public void a(@Nullable dve $$0, cwl $$1, ffs $$2, glv $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, dve.a));
   }

   public static record a() implements hdq.a {
      public static final MapCodec<hdk.a> a = MapCodec.unit(new hdk.a());

      @Override
      public MapCodec<hdk.a> a() {
         return a;
      }

      @Override
      public hdq<?> a(gew $$0) {
         return new hdk(new gop($$0));
      }
   }
}
