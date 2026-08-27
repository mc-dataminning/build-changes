import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record vm(vn j, vn k) {
   public static final Codec<vm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(vn.a.fieldOf("chat").forGetter(vm::a), vn.a.fieldOf("narration").forGetter(vm::b)).apply($$0, vm::new)
   );
   public static final vn b = vn.a("chat.type.text");
   public static final aix<vm> c = a("chat");
   public static final aix<vm> d = a("say_command");
   public static final aix<vm> e = a("msg_command_incoming");
   public static final aix<vm> f = a("msg_command_outgoing");
   public static final aix<vm> g = a("team_msg_command_incoming");
   public static final aix<vm> h = a("team_msg_command_outgoing");
   public static final aix<vm> i = a("emote_command");

   private static aix<vm> a(String $$0) {
      return aix.a(kg.au, new aiy($$0));
   }

   public static void a(ph<vm> $$0) {
      $$0.a(c, new vm(b, vn.a("chat.type.text.narrate")));
      $$0.a(d, new vm(vn.a("chat.type.announcement"), vn.a("chat.type.text.narrate")));
      $$0.a(e, new vm(vn.b("commands.message.display.incoming"), vn.a("chat.type.text.narrate")));
      $$0.a(f, new vm(vn.c("commands.message.display.outgoing"), vn.a("chat.type.text.narrate")));
      $$0.a(g, new vm(vn.d("chat.type.team.text"), vn.a("chat.type.text.narrate")));
      $$0.a(h, new vm(vn.d("chat.type.team.sent"), vn.a("chat.type.text.narrate")));
      $$0.a(i, new vm(vn.a("chat.type.emote"), vn.a("chat.type.emote")));
   }

   public static vm.a a(aix<vm> $$0, bnq $$1) {
      return a($$0, $$1.dM().I_(), $$1.Q_());
   }

   public static vm.a a(aix<vm> $$0, du $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static vm.a a(aix<vm> $$0, iw $$1, vq $$2) {
      iv<vm> $$3 = $$1.d(kg.au);
      return new vm.a($$3.f($$0), $$2);
   }

   public vn a() {
      return this.j;
   }

   public vn b() {
      return this.k;
   }

   public static record a(ij<vm> b, vq c, Optional<vq> d) {
      public static final xo<vb, vm.a> a = xo.a(xm.b(kg.au), vm.a::a, vs.b, vm.a::b, vs.b.a(xm::a), vm.a::c, vm.a::new);

      a(ij<vm> $$0, vq $$1) {
         this($$0, $$1, Optional.empty());
      }

      public vq a(vq $$0) {
         return this.b.a().a().a($$0, this);
      }

      public vq b(vq $$0) {
         return this.b.a().b().a($$0, this);
      }

      public vm.a c(vq $$0) {
         return new vm.a(this.b, this.c, Optional.of($$0));
      }

      public ij<vm> a() {
         return this.b;
      }

      public vq b() {
         return this.c;
      }

      public Optional<vq> c() {
         return this.d;
      }
   }
}
