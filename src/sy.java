import java.util.Map;
import java.util.function.Consumer;

public record sy(Map<ald, ti<alc<tj>>> a, alc<Consumer<sn>> b, Consumer<sn> c) {
   public sy(Map<ald, ti<alc<tj>>> $$0, ald $$1, Consumer<sn> $$2) {
      this($$0, alc.a(me.aJ, $$1), $$2);
   }

   public sy(ald $$0, ti<alc<tj>> $$1, Consumer<sn> $$2) {
      this(Map.of($$0, $$1), $$0, $$2);
   }
}
