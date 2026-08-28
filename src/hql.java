import java.util.function.Consumer;

@FunctionalInterface
public interface hql {
   hql a = ($$0, $$1) -> {
   };

   default hql decorate(Consumer<hqp.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
            $$2.accept($$2x);
            $$0.accept($$2x);
         });
   }

   void send(hqm var1, Consumer<hqp.a> var2);
}
