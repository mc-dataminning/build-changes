import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class gz {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("arguments.item.overstacked", $$0, $$1));
   private final ji<cuj> b;
   private final ki c;

   public gz(ji<cuj> $$0, ki $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cuj a() {
      return this.b.a();
   }

   public cuo a(int $$0, boolean $$1) throws CommandSyntaxException {
      cuo $$2 = new cuo(this.b, $$0);
      $$2.b(this.c);
      if ($$1 && $$0 > $$2.j()) {
         throw a.create(this.b(), $$2.j());
      } else {
         return $$2;
      }
   }

   public String a(jk.a $$0) {
      StringBuilder $$1 = new StringBuilder(this.b());
      String $$2 = this.b($$0);
      if (!$$2.isEmpty()) {
         $$1.append('[');
         $$1.append($$2);
         $$1.append(']');
      }

      return $$1.toString();
   }

   private String b(jk.a $$0) {
      DynamicOps<vo> $$1 = $$0.a(vf.a);
      return this.c.c().flatMap($$1x -> {
         kl<?> $$2 = $$1x.a();
         ale $$3 = lp.as.b($$2);
         Optional<vo> $$4 = $$1x.a($$1).result();
         return $$3 != null && !$$4.isEmpty() ? Stream.of($$3.toString() + "=" + $$4.get()) : Stream.empty();
      }).collect(Collectors.joining(String.valueOf(',')));
   }

   private String b() {
      return this.b.e().map(ald::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
