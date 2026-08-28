import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hho implements hhr {
   private final List<hhr> a;

   public hho(List<hhr> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hhu $$0, daa $$1, hhs $$2, czy $$3, @Nullable gmd $$4, @Nullable bxw $$5, int $$6) {
      $$0.a(this.a.size());

      for (hhr $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hhr.b> b) implements hhr.b {
      public static final MapCodec<hho.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hht.a.listOf().fieldOf("models").forGetter(hho.a::b)).apply($$0, hho.a::new)
      );

      @Override
      public MapCodec<hho.a> a() {
         return a;
      }

      @Override
      public void a(hnt.a $$0) {
         for (hhr.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hhr a(hhr.a $$0) {
         return new hho(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
