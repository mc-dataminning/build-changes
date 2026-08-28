import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class gz {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xp.b("arguments.item.overstacked", $$0, $$1));
   private final ji<cum> b;
   private final ki c;

   public gz(ji<cum> $$0, ki $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cum a() {
      return this.b.a();
   }

   public cur a(int $$0, boolean $$1) throws CommandSyntaxException {
      cur $$2 = new cur(this.b, $$0);
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
      DynamicOps<vp> $$1 = $$0.a(vg.a);
      return this.c.c().flatMap($$1x -> {
         kl<?> $$2 = $$1x.a();
         alf $$3 = lp.as.b($$2);
         Optional<vp> $$4 = $$1x.a($$1).result();
         return $$3 != null && !$$4.isEmpty() ? Stream.of($$3.toString() + "=" + $$4.get()) : Stream.empty();
      }).collect(Collectors.joining(String.valueOf(',')));
   }

   private String b() {
      return this.b.e().map(ale::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
