import java.util.Collection;

public record si(int a, Collection<so> b, js<tj> c) {
   public si(int a, Collection<so> b, js<tj> c) {
      if (b.isEmpty()) {
         throw new IllegalArgumentException("A GameTestBatch must include at least one GameTestInfo!");
      } else {
         this.a = a;
         this.b = b;
         this.c = c;
      }
   }
}
