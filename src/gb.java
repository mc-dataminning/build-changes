import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class gb {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wg.b("arguments.item.overstacked", $$0, $$1));
   private final il<cre> b;
   private final jl c;

   public gb(il<cre> $$0, jl $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cre a() {
      return this.b.a();
   }

   public crj a(int $$0, boolean $$1) throws CommandSyntaxException {
      crj $$2 = new crj(this.b, $$0);
      if ($$1 && $$0 > $$2.i()) {
         throw a.create(this.b(), $$2.i());
      } else {
         $$2.a(this.c);
         return $$2;
      }
   }

   public String a(in.a $$0) {
      StringBuilder $$1 = new StringBuilder(this.b());
      String $$2 = this.b($$0);
      if (!$$2.isEmpty()) {
         $$1.append('[');
         $$1.append($$2);
         $$1.append(']');
      }

      return $$1.toString();
   }

   private String b(in.a $$0) {
      DynamicOps<uj> $$1 = $$0.a(ua.a);
      return this.c.c().flatMap($$1x -> {
         jo<?> $$2 = $$1x.a();
         ajt $$3 = kr.at.b($$2);
         Optional<uj> $$4 = $$1x.a($$1).result();
         return $$3 != null && !$$4.isEmpty() ? Stream.of($$3.toString() + "=" + $$4.get()) : Stream.empty();
      }).collect(Collectors.joining(String.valueOf(',')));
   }

   private String b() {
      return this.b.e().map(ajs::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
