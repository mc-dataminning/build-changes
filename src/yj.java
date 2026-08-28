import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yj(akr d) implements yb {
   public static final MapCodec<yj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akr.a.fieldOf("storage").forGetter(yj::b)).apply($$0, yj::new));
   public static final yb.a<yj> b = new yb.a<>(a, "storage");

   @Override
   public Stream<ub> a(et $$0) {
      ub $$1 = $$0.l().aL().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public yb.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public akr b() {
      return this.d;
   }
}
