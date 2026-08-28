import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcu() implements hdc<cve.a> {
   public static final hdc.a<hcu, cve.a> a = hdc.a.a(MapCodec.unit(new hcu()), cve.a.d);

   public cve.a a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      cys $$5 = $$0.a(kv.O);
      if ($$5 == null || $$5.b()) {
         return cve.a.a;
      } else {
         return $$5.a(cwr.vt) ? cve.a.c : cve.a.b;
      }
   }

   @Override
   public hdc.a<hcu, cve.a> a() {
      return a;
   }
}
