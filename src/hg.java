import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hg {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xk.b("arguments.item.overstacked", $$0, $$1));
   private final jq<cxc> b;
   private final kr c;

   public hg(jq<cxc> $$0, kr $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cxc a() {
      return this.b.a();
   }

   public cxg a(int $$0, boolean $$1) throws CommandSyntaxException {
      cxg $$2 = new cxg(this.b, $$0);
      $$2.b(this.c);
      if ($$1 && $$0 > $$2.k()) {
         throw a.create(this.b(), $$2.k());
      } else {
         return $$2;
      }
   }

   public String a(js.a $$0) {
      StringBuilder $$1 = new StringBuilder(this.b());
      String $$2 = this.b($$0);
      if (!$$2.isEmpty()) {
         $$1.append('[');
         $$1.append($$2);
         $$1.append(']');
      }

      return $$1.toString();
   }

   private String b(js.a $$0) {
      DynamicOps<vj> $$1 = $$0.a(va.a);
      return this.c.b().stream().flatMap($$1x -> {
         kt<?> $$2 = (kt<?>)$$1x.getKey();
         alp $$3 = ma.ao.b($$2);
         if ($$3 == null) {
            return Stream.empty();
         } else {
            Optional<?> $$4 = (Optional<?>)$$1x.getValue();
            if ($$4.isPresent()) {
               kw<?> $$5 = kw.a($$2, $$4.get());
               return $$5.a($$1).result().stream().map($$1xx -> $$3.toString() + "=" + $$1xx);
            } else {
               return Stream.of("!" + $$3.toString());
            }
         }
      }).collect(Collectors.joining(String.valueOf(',')));
   }

   private String b() {
      return this.b.e().map(alo::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
