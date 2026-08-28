import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.JavaOps;
import java.util.Collection;
import java.util.List;

public class fv extends bqj<xx> {
   private static final Collection<String> b = List.of("{bold: true}", "{color: 'red'}", "{}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xa.b("argument.style.invalid", $$0));
   private static final bqe<Object> c = ut.a(JavaOps.INSTANCE);

   private fv(jh.a $$0) {
      super(c.a($$0.a(JavaOps.INSTANCE), c, xx.b.b, a));
   }

   public static xx a(CommandContext<ej> $$0, String $$1) {
      return (xx)$$0.getArgument($$1, xx.class);
   }

   public static fv a(ef $$0) {
      return new fv($$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
