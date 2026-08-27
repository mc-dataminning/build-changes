import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class go {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("arguments.item.overstacked", $$0, $$1));
   private final ix<ctl> b;
   private final jx c;

   public go(ix<ctl> $$0, jx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ctl a() {
      return this.b.a();
   }

   public ctq a(int $$0, boolean $$1) throws CommandSyntaxException {
      ctq $$2 = new ctq(this.b, $$0);
      $$2.a(this.c);
      if ($$1 && $$0 > $$2.j()) {
         throw a.create(this.b(), $$2.j());
      } else {
         return $$2;
      }
   }

   public String a(iz.a $$0) {
      StringBuilder $$1 = new StringBuilder(this.b());
      String $$2 = this.b($$0);
      if (!$$2.isEmpty()) {
         $$1.append('[');
         $$1.append($$2);
         $$1.append(']');
      }

      return $$1.toString();
   }

   private String b(iz.a $$0) {
      DynamicOps<va> $$1 = $$0.a(ur.a);
      return this.c.c().flatMap($$1x -> {
         ka<?> $$2 = $$1x.a();
         akn $$3 = le.as.b($$2);
         Optional<va> $$4 = $$1x.a($$1).result();
         return $$3 != null && !$$4.isEmpty() ? Stream.of($$3.toString() + "=" + $$4.get()) : Stream.empty();
      }).collect(Collectors.joining(String.valueOf(',')));
   }

   private String b() {
      return this.b.e().map(akm::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
