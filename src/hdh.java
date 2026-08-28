import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hdh implements hdk {
   private final List<hdk> a;

   public hdh(List<hdk> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hdn $$0, cxy $$1, hdl $$2, cxw $$3, @Nullable ghz $$4, @Nullable bwr $$5, int $$6) {
      $$0.a(this.a.size());

      for (hdk $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hdk.b> b) implements hdk.b {
      public static final MapCodec<hdh.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hdm.a.listOf().fieldOf("models").forGetter(hdh.a::b)).apply($$0, hdh.a::new)
      );

      @Override
      public MapCodec<hdh.a> a() {
         return a;
      }

      @Override
      public void a(hjk.a $$0) {
         for (hdk.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hdk a(hdk.a $$0) {
         return new hdh(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
