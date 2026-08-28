import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gma implements bqv {
   private final gmt a;
   private final Set<bqt> b = new ObjectOpenHashSet();
   private final brb c = new brb();

   public gma(LongSupplier $$0, gmt $$1) {
      this.a = $$1;
      this.b.add(brc.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(brc.a());
      this.b.add(bqt.a("totalChunks", bqs.f, this.a, gmt::h));
      this.b.add(bqt.a("renderedChunks", bqs.f, this.a, gmt::j));
      this.b.add(bqt.a("lastViewDistance", bqs.f, this.a, gmt::i));
      gql $$0 = this.a.g();
      this.b.add(bqt.a("toUpload", bqs.g, $$0, gql::c));
      this.b.add(bqt.a("freeBufferCount", bqs.g, $$0, gql::d));
      this.b.add(bqt.a("toBatchCount", bqs.g, $$0, gql::b));
      if (fgk.a().isPresent()) {
         this.b.add(bqt.a("gpuUtilization", bqs.i, fmg.Q(), fmg::v));
      }
   }

   @Override
   public Set<bqt> a(Supplier<bpg> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
