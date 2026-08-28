import java.util.Collection;

public record sj(int a, Collection<sp> b, je<tk> c) {
   public sj(int a, Collection<sp> b, je<tk> c) {
      if (b.isEmpty()) {
         throw new IllegalArgumentException("A GameTestBatch must include at least one GameTestInfo!");
      } else {
         this.a = a;
         this.b = b;
         this.c = c;
      }
   }
}
