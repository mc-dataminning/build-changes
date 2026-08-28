import java.util.Map;
import java.util.function.Consumer;

public record tb(Map<alr, tl<alq<tm>>> a, alq<Consumer<sq>> b, Consumer<sq> c) {
   public tb(Map<alr, tl<alq<tm>>> $$0, alr $$1, Consumer<sq> $$2) {
      this($$0, alq.a(mi.ay, $$1), $$2);
   }

   public tb(alr $$0, tl<alq<tm>> $$1, Consumer<sq> $$2) {
      this(Map.of($$0, $$1), $$0, $$2);
   }
}
